package survata.com.survatasays.model;

public class Question {
    private String mName;
    private int mPercentage;

    public Question(String name, int percentage) {
        mName = name;
        mPercentage = percentage;
    }


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getPercentage() {
        return mPercentage;
    }

    public void setPercentage(int percentage) {
        mPercentage = percentage;
    }
}
