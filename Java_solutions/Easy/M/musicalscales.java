package Easy.M;

import java.util.*;

public class musicalscales {
    // Define the 12 musical notes
    private static final String[] NOTES = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
    // Define the major scale pattern in semitone steps
    private static final int[] SCALE_STEPS = {2, 2, 1, 2, 2, 2, 1};

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        myScanner.nextLine();

        // Read song notes
        String[] songNotes = myScanner.nextLine().split(" ");
        Set<String> songSet = new HashSet<>(Arrays.asList(songNotes)); // Store song notes in a set for quick lookup

        // Generate all major scales
        Map<String, Set<String>> majorScales = generateMajorScales();

        // Find all valid scales
        List<String> validScales = new ArrayList<>();
        for (String scale : majorScales.keySet()) {
            if (majorScales.get(scale).containsAll(songSet)) {
                validScales.add(scale);
            }
        }

        Collections.sort(validScales);
        System.out.println(validScales.isEmpty() ? "none" : String.join(" ", validScales));
    }

    private static Map<String, Set<String>> generateMajorScales() {
        Map<String, Set<String>> scales = new HashMap<>();

        for (int i = 0; i < NOTES.length; i++) {
            Set<String> scaleNotes = new HashSet<>();
            int index = i;

            for (int step : SCALE_STEPS) {
                scaleNotes.add(NOTES[index]); // Add the note
                index = (index + step) % NOTES.length; // Move by step, wrap around if necessary
            }
            scaleNotes.add(NOTES[i]); // Repeat root note at the end

            scales.put(NOTES[i], scaleNotes);
        }

        return scales;
    }
}
