package com.bytebreeze.quickdrop.dto.request;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParcelBookingRequestDTO {

	@NotNull(message = "Product category is required.")
	private UUID categoryId;

	@Size(max = 255, message = "Description cannot exceed 255 characters.")
	private String description;

	@NotNull(message = "Weight is required.")
	@Positive(message = "Weight must be a positive number.")
	private Double weight;

	@NotNull(message = "Size is required.")
	@Positive(message = "Weight must be a positive number.")
	private Double size;

	@NotBlank(message = "Receiver name is required.")
	@Size(max = 100, message = "Receiver name cannot exceed 100 characters.")
	private String receiverName;

	@NotBlank(message = "Receiver phone is required.")
	@Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$", message = "Invalid phone number.")
	private String receiverPhone;

	@Email(message = "Invalid email address.")
	private String receiverEmail;

	@NotBlank(message = "Receiver address is required.")
	@Size(max = 255, message = "Receiver address cannot exceed 255 characters.")
	private String receiverAddress;

	@NotNull(message = "Price is required.")
	@DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than zero.")
	private BigDecimal price;

	@NotNull(message = "Distance is required.")
	@Positive(message = "Distance must be a positive number.")
	private Double distance;

	@NotNull(message = "Payment method is required.")
	private String paymentMethod;

	private String transactionId;
}
