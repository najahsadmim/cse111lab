
public class BrowserHistory {

    public String webhistory[];
    public String url;
    public int count = 0;
    public int cap;
    public int current;

    public BrowserHistory(int cap) {
        this.cap = cap;
        webhistory = new String[cap];
    }

    public void visitWeb(String url) {
        this.url = url;
        if (count < cap) {
            webhistory[count] = url;
            count++;
            current++;
        } else {
            System.out.println("History is full. Cannot visit " + url);
        }
    }

    public void currentWeb() {
        if (current == 0) {
            System.out.println("You have not visited any website yet!");
        } else {
            System.out.println("Current web page: " + webhistory[current - 1]);
        }
    }

    public void back() {
        if (count > 0) {
            current--;
            count--;
        }
    }

    public void showHistory() {
        if (count == 0) {
            System.out.println("No web pages visited yet.");
        } else {
            System.out.println("Browser History: ");
            for (int i = 0; i < count; i++) {
                System.out.println(webhistory[i]);
            }
        }
    }
}
