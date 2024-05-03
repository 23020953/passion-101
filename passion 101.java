import java.util.Scanner;

public class PassionExplorer {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Passion Explorer!");
        System.out.println("Embark on a journey of self-discovery by answering intriguing questions.\n");
        
        // Prompt the user with a variety of stimulating questions
        System.out.println("1. What activities or hobbies completely absorb your attention and make time fly by?");
        String q1 = scanner.nextLine();
        
        System.out.println("2. Picture a day without limitations. How would you choose to spend it?");
        String q2 = scanner.nextLine();
        
        System.out.println("3. Recall the last piece of content that truly fascinated you. What was it about?");
        String q3 = scanner.nextLine();
        
        System.out.println("4. Reflect on a moment of significant accomplishment or fulfillment. What were you doing?");
        String q4 = scanner.nextLine();
        
        System.out.println("5. Consider your dreams and ambitions from childhood. How have they evolved over time?");
        String q5 = scanner.nextLine();
        
        // Explore further with additional questions
        System.out.println("6. If you could tackle any global challenge, what would it be?");
        String q6 = scanner.nextLine();
        
        System.out.println("7. Think back to a tough situation you faced. How did you navigate through it?");
        String q7 = scanner.nextLine();
        
        System.out.println("8. Recall a moment of inspiration or admiration for someone or something. What stirred you?");
        String q8 = scanner.nextLine();
        
        System.out.println("9. Delve into your favorite pastimes. What do they reveal about your interests?");
        String q9 = scanner.nextLine();
        
        System.out.println("10. Reflect on your most enjoyable learning experience. What made it memorable?");
        String q10 = scanner.nextLine();
        
        // ... add more intriguing questions ...
        
        System.out.println("\nAnalyzing your responses...\n");
        
        // Analyze responses to suggest potential passion areas
        System.out.println("Based on your answers, here are insights into potential passion areas:");
        System.out.println("1. " + suggestPassion(q1));
        System.out.println("2. " + suggestPassion(q2));
        System.out.println("3. " + suggestPassion(q3));
        System.out.println("4. " + suggestPassion(q4));
        System.out.println("5. " + suggestPassion(q5));
        
        // Offer encouragement and guidance for further exploration
        System.out.println("\nRemember, discovering your passion is a journey. Keep exploring and embracing new experiences!");
        
        scanner.close();
    }
    
    // Function to suggest potential passion areas based on user responses
    public static String suggestPassion(String response) {
        // Map responses to potential passion areas
        if (response.contains("programming") || response.contains("coding") || response.contains("software")) {
            return "Your interest in problem-solving and technology hints at a passion for software development or computer science.";
        } else if (response.contains("reading") || response.contains("writing") || response.contains("literature")) {
            return "Your love for storytelling and imagination suggests a passion for writing, literature, or journalism.";
        } else if (response.contains("music") || response.contains("playing instruments") || response.contains("singing")) {
            return "Your fascination with music and creativity suggests a passion for music composition or performance.";
        } else if (response.contains("traveling") || response.contains("exploring")) {
            return "Your adventurous spirit and curiosity about the world point to a passion for traveling or cultural exploration.";
        } else {
            return "Your diverse interests and experiences suggest that you have many potential passions waiting to be discovered. Keep exploring!";
        }
    }
}
