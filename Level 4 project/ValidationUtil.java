/**
 * Utility class for validating input data.
 */
public class ValidationUtil {
    /**
     * Validates that a string is not null or empty.
     *
     * @param value     the string to validate
     * @param fieldName the name of the field (used in exception messages)
     * @throws IllegalArgumentException if the string is null or empty
     */
    public static void validateString(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }
