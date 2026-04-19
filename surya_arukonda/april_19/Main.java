public class Main {
    public static void main(String[] args) {
        ReturnTypesDemo demo = new ReturnTypesDemo();

        System.out.println(demo.getByteValue());
        System.out.println(demo.getShortValue());
        System.out.println(demo.getIntValue());
        System.out.println(demo.getLongValue());
        System.out.println(demo.getFloatValue());
        System.out.println(demo.getDoubleValue());
        System.out.println(demo.getCategory());
        System.out.println(demo.isActive());

        System.out.println(demo.getCompanyName());

        Company company = demo.getCompany();
        System.out.println(company.getDetails());

        Company[] companies = demo.getCompanies();
        for (Company item : companies) {
            System.out.println(item.getDetails());
        }

        System.out.println(demo.testStringImmutability());
        System.out.println(demo.getSubstringValue());
        System.out.println(demo.getUpperCaseValue());
        System.out.println(demo.getLowerCaseValue());
        System.out.println(demo.getStringLength());
        System.out.println(demo.getCharacterAt());
        System.out.println(demo.checkContains());
        System.out.println(demo.checkStartsWith());
        System.out.println(demo.checkEndsWith());
        System.out.println(demo.replaceText());
        System.out.println(demo.trimText());
        System.out.println(demo.getDateValue());
        System.out.println(demo.getCurrentTimeMillisValue());

        PrintOneToTen printOneToTen = new PrintOneToTen();
        printOneToTen.printNumbers();
        System.out.println();

        PrintOddNumbers printOddNumbers = new PrintOddNumbers();
        printOddNumbers.printOddNumbers();
        System.out.println();

        TableOfSeven tableOfSeven = new TableOfSeven();
        tableOfSeven.printTable();
        System.out.println();

        TablesOneToTen tablesOneToTen = new TablesOneToTen();
        tablesOneToTen.printTables();

        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
        System.out.println(celsiusToFahrenheit.convert(25));
        System.out.println();

        int[] numbers = {10, 20, 30, 40, 50};

        SumOfArray sumOfArray = new SumOfArray();
        System.out.println(sumOfArray.findSum(numbers));

        AverageOfArray averageOfArray = new AverageOfArray();
        System.out.println(averageOfArray.findAverage(numbers));

        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("java"));

        PalindromeCheck palindromeCheck = new PalindromeCheck();
        System.out.println(palindromeCheck.isPalindrome("madam"));

        FirstNonRepeatedCharacter firstNonRepeatedCharacter = new FirstNonRepeatedCharacter();
        System.out.println(firstNonRepeatedCharacter.findFirstNonRepeated("swiss"));

        AnagramCheck anagramCheck = new AnagramCheck();
        System.out.println(anagramCheck.areAnagrams("listen", "silent"));

        VowelCount vowelCount = new VowelCount();
        System.out.println(vowelCount.countVowels("Hello World"));

    }
}
