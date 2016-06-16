package survata.com.survatasays.model;

public class Questions {
    private Question[] mQuestions;

    public Questions() {
        mQuestions = new Question[44];

        mQuestions[0] = new Question("Guess the % of people who said BLUE was their favorite color.", 30);

        mQuestions[1] = new Question("Guess the % of people who said they eat candy at least once per day", 13);

        mQuestions[2] = new Question("Guess the % of people who most often watch TV shows live on television", 47);

        mQuestions[3] = new Question("Guess the % of people who said Coke was their favorite soda", 26);

        mQuestions[4] = new Question("Guess the % of people who use Facebook the most", 64);

        mQuestions[5] = new Question("Guess the % of people who prefer cats over dogs", 20);

        mQuestions[6] = new Question("Guess the % of people who are solely introverts", 30);

        mQuestions[7] = new Question("Guess the % of people who said rap was their favorite genre of music", 6);

        mQuestions[8] = new Question("Guess the % of people who said American food was their favorite kind of food", 25);

        mQuestions[9] = new Question("Guess the % of people who said Cookie Dough was their favorite ice cream flavor", 11);

        mQuestions[10] = new Question("Guess the % of people who said that Taco Bell was their favorite fast-food chain", 12);

        mQuestions[11] = new Question("Guess the % of people who said that Action was their favorite movie genre", 16);

        mQuestions[12] = new Question("Guess the % of people who don't have a favorite brand of gum", 33);

        mQuestions[13] = new Question("Guess the % of people who said black coffee was their favorite coffee drink", 21);

        mQuestions[14] = new Question("Guess the % of people who said beef is their favorite meat", 37);

        mQuestions[15] = new Question("Guess the % of people who said that the beach is their ideal vacation spot", 45);

        mQuestions[16] = new Question("Guess the % of people who said that leggings are their favorite pants", 9);

        mQuestions[17] = new Question("Guess the % of people who haven't been to any other country", 33);

        mQuestions[18] = new Question("Guess the % of people who said that Family Guy was their favorite guilty pleasure TV show", 15);

        mQuestions[19] = new Question("Guess the % of people who said that One Direction was their favorite boy band", 7);

        mQuestions[20] = new Question("Guess the % of people who said that Finding Nemo was their favorite animated movie", 17);

        mQuestions[21] = new Question("Guess the % of people who said that peaches was their favorite fruit", 14);

        mQuestions[22] = new Question("Guess the % of people who said that tea was their favorite beverage",15);

        mQuestions[23] = new Question("Guess the % of people who said that orange juice was their favorite juice", 33);

        mQuestions[24] = new Question("Guess the % of people who don't have a favorite superhero", 20);

        mQuestions[25] = new Question("Guess the % of people who said that Sriracha was their favorite condiment", 4);

        mQuestions[26] = new Question("Guess the % of people who said that Call of Duty was their favorite video game", 9);

        mQuestions[27] = new Question("Guess the % of people who said that Youtube was their favorite music platform", 20);

        mQuestions[28] = new Question("Guess the % of people who said that Internet Explorer was their favorite Internet browser", 13);

        mQuestions[29] = new Question("Guess the % of people who said that swimming was their favorite sport", 9);

        mQuestions[30] = new Question("Guess the % of people who said that Fox News was their favorite news source", 20);

        mQuestions[31] = new Question("Guess the % of people who watch 5+ hours of TV daily", 21);

        mQuestions[32] = new Question("Guess the % of people who don't speak a second language", 77);

        mQuestions[33] = new Question("Guess the % of people who wish invisibility could be their superpower", 20);

        mQuestions[34] = new Question("Guess the % of people who would want to be the smartest person in the world", 41);

        mQuestions[35] = new Question("Guess the percentage of people who would want to be a penguin for a day", 5);

        mQuestions[36] = new Question("Guess the % of people who spend most of their money on food", 34);

        mQuestions[37] = new Question("Guess the % of people who said that New York City was the best city in the USA", 20);

        mQuestions[38] = new Question("Guess the % of people who said that Orange is The New Black is their favorite Netflix original show", 10);

        mQuestions[39] = new Question("Guess the % of people who said that winter is their favorite season", 7);

        mQuestions[40] = new Question("Guess the percentage of people who said that Christmas/Hanukkah/Kwanzaa was their favorite holiday",  43);

        mQuestions[41] = new Question("Guess the percentage of people who don't have a favorite Starburst flavor",  37);

        mQuestions[42] = new Question("Guess the percentage of people who prefer Android over iPhone", 28);

        mQuestions[43] = new Question("Guess the % of people who said that McDonald's was their favorite coffee chain", 6);

    }

    public Question getQuestion(int questionNumber) {
        return mQuestions[questionNumber];
    }
}
