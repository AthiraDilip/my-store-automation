package enums;

public enum FieldName {
    TITLE("Title"),
    FIRST_NAME("First Name"),
    LAST_NAME("Last Name"),
    PASSWORD("Password"),
    DATE_OF_BIRTH("Date Of Birth"),
    COMPANY("Company"),
    ADDRESS("Address"),
    CITY("City"),
    STATE("State"),
    ZIP_POSTAL_CODE("Zip/Postal code"),
    COUNTRY("Country"),
    ADDITIONAL_INFORMATION("Additional Information"),
    HOME_PHONE("Home Phone"),
    MOBILE_PHONE("Mobile Phone"),
    ADDRESS_ALIAS("Address Alias");

    private final String fieldName;

    FieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public static FieldName getButtonName(String buttonLookUpValue) {
        for (FieldName fieldName : FieldName.values()) {
            if (fieldName.fieldName.equalsIgnoreCase(buttonLookUpValue)) {
                return fieldName;
            }
        }
        return null;
    }

}
