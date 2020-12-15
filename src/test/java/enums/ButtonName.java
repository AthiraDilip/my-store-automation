package enums;

public enum ButtonName {
    PROCEED_TO_CHECKOUT("PROCEED TO CHECKOUT"),
    CONTINUE_SHOPPING("CONTINUE SHOPPING"),
    CREATE_AN_ACCOUNT("CREATE AN ACCOUNT"),
    REGISTER("REGISTER");

    private final String buttonName;

    ButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public static ButtonName getButtonName(String buttonLookUpValue) {
        for (ButtonName buttonName : ButtonName.values()) {
            if (buttonName.buttonName.equalsIgnoreCase(buttonLookUpValue)) {
                return buttonName;
            }
        }
        return null;
    }

}
