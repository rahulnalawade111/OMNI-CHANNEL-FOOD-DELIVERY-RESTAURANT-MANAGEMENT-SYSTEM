package com.restaurantmanagement.dto; import jakarta.validation.constraints.*; public record LoginRequest(@NotBlank @Email String email,@NotBlank @Size(min=8) String password) {}
