    /**
     * Validates that a number is positive.
     *
     * @param value     the number to validate
     * @param fieldName the name of the field (used in exception messages)
     * @throws IllegalArgumentException if the number is not positive
     */
    public static void validatePositiveNumber(double value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be a positive number");
        }
    }
}