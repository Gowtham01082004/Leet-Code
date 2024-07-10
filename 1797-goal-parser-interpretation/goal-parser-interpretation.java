class Solution {
    public String interpret(String command) {
        String cleanedString = command.replace("()", "o").replace("(", "").replace(")", "");
        return cleanedString;
    }
}