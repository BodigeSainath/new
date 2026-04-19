import java.util.Date;

class ReturnTypesDemo {

    byte getByteValue() {
        return 12;
    }

    short getShortValue() {
        return 1500;
    }

    int getIntValue() {
        return 45000;
    }

    long getLongValue() {
        return 9876543210L;
    }

    float getFloatValue() {
        return 45.67f;
    }

    double getDoubleValue() {
        return 1234.5678;
    }

    char getCategory() {
        return 'A';
    }

    boolean isActive() {
        return true;
    }

    String getCompanyName() {
        return "TechNova Solutions";
    }

    Company getCompany() {
        return new Company(101, "Google");
    }

    Company[] getCompanies() {
        return new Company[] {
            new Company(201, "Amazon"),
            new Company(202, "Microsoft"),
            new Company(203, "Netflix")
        };
    }

    String testStringImmutability() {
        String original = "Java";
        String updated = original.concat(" Developer");
        return "original = " + original + ", updated = " + updated;
    }

    String getSubstringValue() {
        String text = "Programming";
        return text.substring(3, 8);
    }

    String getUpperCaseValue() {
        String text = "company";
        return text.toUpperCase();
    }

    String getLowerCaseValue() {
        String text = "SOFTWARE";
        return text.toLowerCase();
    }

    int getStringLength() {
        String text = "Developer";
        return text.length();
    }

    char getCharacterAt() {
        String text = "Java";
        return text.charAt(2);
    }

    boolean checkContains() {
        String text = "Welcome to Java";
        return text.contains("Java");
    }

    boolean checkStartsWith() {
        String text = "Technology";
        return text.startsWith("Tech");
    }

    boolean checkEndsWith() {
        String text = "report.pdf";
        return text.endsWith(".pdf");
    }

    String replaceText() {
        String text = "I like Java";
        return text.replace("Java", "Spring");
    }

    String trimText() {
        String text = "   Hello World   ";
        return text.trim();
    }

    String getDateValue() {
        java.util.Date today = new Date();
        return today.toString();
    }

    long getCurrentTimeMillisValue() {
        java.util.Date today = new Date();
        return today.getTime();
    }
}