package com.bytebreeze.quickdrop.controller;

import com.bytebreeze.quickdrop.dto.UserProfileUpdateDto;
import com.bytebreeze.quickdrop.service.UserService;
import jakarta.validation.Valid;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private static final String DASHBOARD_PROFILE_SETTINGS_PAGE = "dashboard/admin-account";

    private UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Authentication authentication) {
        if (authentication != null && authentication.isAuthenticated()
                && !(authentication instanceof AnonymousAuthenticationToken)) {
            return "redirect:/admin/dashboard";
        }
        return "auth/admin-login";
    }

    @GetMapping("/dashboard")
    public String adminDashboard() {
        return "dashboard/admin-dashboard"; // Renders `admin-dashboard.html`
    }

    @GetMapping("/profile-settings")
    public String basicProfileSettings(Model model)
    {
        model.addAttribute("userProfileUpdateDto", userService.userProfileUpdateGet());
        return DASHBOARD_PROFILE_SETTINGS_PAGE;
    }

    @PostMapping("/profile-settings")
    public String updateAccountSettings(
            @Valid @ModelAttribute("userProfileUpdateDto") UserProfileUpdateDto dto,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes,
            Model model)
    {

        if (bindingResult.hasErrors()) {
            return DASHBOARD_PROFILE_SETTINGS_PAGE;
        }

        try {
            userService.updateUserProfile(dto);
        } catch (Exception e) {
            model.addAttribute("updateError", "An error occurred while updating your profile. Please try again.");
            return DASHBOARD_PROFILE_SETTINGS_PAGE;
        }

        redirectAttributes.addFlashAttribute("successMessage", "Profile updated successfully!");
        return "redirect:/admin/profile-settings?success";
    }
}
