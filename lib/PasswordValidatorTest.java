package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1: Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1: FAILED: Expected INVALID but got " + result1);
        }
        
        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK
        PasswordStrength result2 = PasswordValidator.validate("abcdefghij");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2: Passed:  All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2: FAILED: Expected WEAK but got " + result2);
        }

        // Test Case 3: รหัสผ่านทั้งหมดเป็นตัวใหญ่จะ WEAK
        PasswordStrength result3 = PasswordValidator.validate("ABCDEFGHIJ");
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3: Passed:  All upper password is WEAK.");
        } else {
            System.out.println("Test Case 3: FAILED: Expected WEAK but got " + result3);
        }

        // Test Case 4: รหัสผ่านทั้งหมดเป็นตัวเลขจะ WEAK
        PasswordStrength result4 = PasswordValidator.validate("ABCDEFGHIJ");
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4: Passed:  All digit  password is WEAK.");
        } else {
            System.out.println("Test Case 4: FAILED: Expected WEAK but got " + result4);
        }

        // Test Case 5: รหัสผ่านมีทั้งเลข และ อักษร
        PasswordStrength result5 = PasswordValidator.validate("test1234");
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5: Passed:  All password is MEDIUM.");
        } else {
            System.out.println("Test Case 5: FAILED: Expected MEDIUM but got " + result5);
        }
        
        // Test Case 6: รหัสผ่านมีทั้งอักษรพิศษและ อักษร
        PasswordStrength result6 = PasswordValidator.validate("%test#");
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6: Passed:  All password is MEDIUM.");
        } else {
            System.out.println("Test Case 6: FAILED: Expected MEDIUM but got " + result6);
        }

        // Test Case 7: รหัสผ่านมีทั้งตั้วอักษรใหญ่และเล็ก ตัวเลข และตัวอักษรพิเศษ
        PasswordStrength result7 = PasswordValidator.validate("#byeBye211#");
        if (result7 == PasswordStrength.STRONG) {
            System.out.println("Test Case 7: Passed: All password is STRONG.");
        } else {
            System.out.println("Test Case 7: FAILED: Expected STRONG but got " + result7);
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---

        System.out.println("--------------------------------");
    }
}
