public interface Interface{
    /*
     * first method
     * will subtract the maximum valued bill/coin in decending order (start with $100 end on 1¢)
     */
    void subtractingMax(double Change);

    /*
     * second method
     * will split apart the change into hundreds/greater than hundreds, tens, ones, and coins/decimal number
     */
    void splitAndCount(double Change);

    //userInput
    void userInput();
}