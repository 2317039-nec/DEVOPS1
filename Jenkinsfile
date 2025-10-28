pipeline { 
    agent any 
 
    stages { 
        stage('Create Dictionary App') { 
            steps { 
                script { 
                    writeFile file: 'DictionaryApp.java', text: ''' 
import java.util.HashMap; 
 
public class DictionaryApp { 
    public static void main(String[] args) { 
        System.out.println("=== Dictionary App ==="); 
 
        // Predefined dictionary 
        HashMap<String, String> dictionary = new HashMap<>(); 
        dictionary.put("apple", "A fruit that is round and usually red or green."); 
        dictionary.put("java", "A high-level programming language."); 
        dictionary.put("jenkins", "An open-source automation server used for CI/CD."); 
        dictionary.put("pipeline", "A sequence of automated steps in software development."); 
 
        // Words to "search" 
        String[] wordsToSearch = {"apple", "java", "jenkins", "pipeline"}; 
 
        // Display results 
        for(String word : wordsToSearch) { 
            System.out.println("Word: " + word); 
            System.out.println("Meaning: " + dictionary.get(word)); 
            System.out.println("----------------------------"); 
        } 
 
        System.out.println("=== End of Dictionary ==="); 
    } 
} 
''' 
                } 
            } 
        } 
 
        stage('Compile Dictionary App') { 
            steps { 
                bat 'javac DictionaryApp.java' 
            } 
        } 
 
        stage('Run Dictionary App') { 
            steps { 
                bat 'java DictionaryApp' 
            } 
        } 
    } 
}
