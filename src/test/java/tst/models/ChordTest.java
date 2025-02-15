package tst.models;

import org.junit.jupiter.api.Test;
import sample.models.Note;
import sample.models.chords.Chord;
import sample.models.chords.ChordType;

import static org.junit.Assert.assertEquals;

public class ChordTest {

    @Test
    public void chordTypeTest() throws Exception {
        Chord cMajorTriadChord = new Chord(ChordType.MAJOR_TRIAD, new Note());
        Chord cMinorTriadChord = new Chord(ChordType.MINOR_TRIAD, new Note());
        Chord cMajor7thChord = new Chord(ChordType.MAJOR_7TH, new Note());
        Chord cMinor7thChord = new Chord(ChordType.MINOR_7TH, new Note());
        Chord cMajor9thChord = new Chord(ChordType.MAJOR_9TH, new Note());
        Chord cMinor9thChord = new Chord(ChordType.MINOR_9TH, new Note());
        Chord cDominant7thChord = new Chord(ChordType.DOMINANT_7TH, new Note());
        Chord cDominant9thChord = new Chord(ChordType.DOMINANT_9TH, new Note());

        assertEquals(ChordType.MAJOR_TRIAD, cMajorTriadChord.type);
        assertEquals(ChordType.MINOR_TRIAD, cMinorTriadChord.type);
        assertEquals(ChordType.MAJOR_7TH, cMajor7thChord.type);
        assertEquals(ChordType.MINOR_7TH, cMinor7thChord.type);
        assertEquals(ChordType.MAJOR_9TH, cMajor9thChord.type);
        assertEquals(ChordType.MINOR_9TH, cMinor9thChord.type);
        assertEquals(ChordType.DOMINANT_7TH, cDominant7thChord.type);
        assertEquals(ChordType.DOMINANT_9TH, cDominant9thChord.type);
    }

    @Test
    public void triadTest() throws Exception {
        Chord cMajorTriadChord = new Chord(ChordType.MAJOR_TRIAD, new Note());
        Chord cMinorTriadChord = new Chord(ChordType.MINOR_TRIAD, new Note());

        assertEquals(new Note().getName(), cMajorTriadChord.notes()[0].getName());
        assertEquals(new Note("E1").getName(), cMajorTriadChord.notes()[1].getName());
        assertEquals(new Note("G1").getName(), cMajorTriadChord.notes()[2].getName());

        assertEquals(new Note().getName(), cMinorTriadChord.notes()[0].getName());
        assertEquals(new Note("Eb1").getName(), cMinorTriadChord.notes()[1].getName());
        assertEquals(new Note("G1").getName(), cMinorTriadChord.notes()[2].getName());
    }

    @Test
    public void suspendedTest() throws Exception {
        Chord cSuspended2ndChord = new Chord(ChordType.SUSPENDED_2ND, new Note());
        Chord cSuspended4thChord = new Chord(ChordType.SUSPENDED_4TH, new Note());

        assertEquals("C1", cSuspended2ndChord.notes()[0].toString());
        assertEquals("D1", cSuspended2ndChord.notes()[1].toString());
        assertEquals("G1", cSuspended2ndChord.notes()[2].toString());

        assertEquals("C1", cSuspended4thChord.notes()[0].toString());
        assertEquals("F1", cSuspended4thChord.notes()[1].toString());
        assertEquals("G1", cSuspended4thChord.notes()[2].toString());
    }

    @Test
    public void major6thTest() throws Exception {
        Chord cMajor6th = new Chord(ChordType.MAJOR_6TH, new Note());

        assertEquals("C1", cMajor6th.notes()[0].toString());
        assertEquals("E1", cMajor6th.notes()[1].toString());
        assertEquals("G1", cMajor6th.notes()[2].toString());
        assertEquals("A1", cMajor6th.notes()[3].toString());
    }

    @Test
    public void minor6thTest() throws Exception {
        Chord cMinor6th = new Chord(ChordType.MINOR_6TH, new Note());

        assertEquals("C1", cMinor6th.notes()[0].toString());
        assertEquals("Eb1", cMinor6th.notes()[1].toString());
        assertEquals("G1", cMinor6th.notes()[2].toString());
        assertEquals("A1", cMinor6th.notes()[3].toString());
    }

    @Test
    public void chord7thTest() throws Exception {
        Chord cMajor7thChord = new Chord(ChordType.MAJOR_7TH, new Note());
        Chord cMinor7thChord = new Chord(ChordType.MINOR_7TH, new Note());

        assertEquals(new Note().getName(), cMajor7thChord.notes()[0].getName());
        assertEquals(new Note("E1").getName(), cMajor7thChord.notes()[1].getName());
        assertEquals(new Note("G1").getName(), cMajor7thChord.notes()[2].getName());
        assertEquals(new Note("B1").getName(), cMajor7thChord.notes()[3].getName());

        assertEquals(new Note().getName(), cMinor7thChord.notes()[0].getName());
        assertEquals(new Note("Eb1").getName(), cMinor7thChord.notes()[1].getName());
        assertEquals(new Note("G1").getName(), cMinor7thChord.notes()[2].getName());
        assertEquals(new Note("Bb1").getName(), cMinor7thChord.notes()[3].getName());
    }

    @Test
    public void chord9thTest() throws Exception {
        Chord cMajor9thChord = new Chord(ChordType.MAJOR_9TH, new Note());
        Chord cMinor9thChord = new Chord(ChordType.MINOR_9TH, new Note());

        assertEquals(new Note().getName(), cMajor9thChord.notes()[0].getName());
        assertEquals(new Note("E1").getName(), cMajor9thChord.notes()[1].getName());
        assertEquals(new Note("G1").getName(), cMajor9thChord.notes()[2].getName());
        assertEquals(new Note("B1").getName(), cMajor9thChord.notes()[3].getName());
        assertEquals(new Note("D2").getName(), cMajor9thChord.notes()[4].getName());

        assertEquals(new Note().getName(), cMinor9thChord.notes()[0].getName());
        assertEquals(new Note("Eb1").getName(), cMinor9thChord.notes()[1].getName());
        assertEquals(new Note("G1").getName(), cMinor9thChord.notes()[2].getName());
        assertEquals(new Note("Bb1").getName(), cMinor9thChord.notes()[3].getName());
        assertEquals(new Note("D2").getName(), cMajor9thChord.notes()[4].getName());
    }

    @Test
    public void chord11thTest() throws Exception {
        Chord cMajor11thChord = new Chord(ChordType.MAJOR_11TH, new Note());
        Chord cMinor11thChord = new Chord(ChordType.MINOR_11TH, new Note());

        assertEquals("C1", cMajor11thChord.notes()[0].getName());
        assertEquals("E1", cMajor11thChord.notes()[1].getName());
        assertEquals("G1", cMajor11thChord.notes()[2].getName());
        assertEquals("B1", cMajor11thChord.notes()[3].getName());
        assertEquals("D2", cMajor11thChord.notes()[4].getName());
        assertEquals("F2", cMajor11thChord.notes()[5].getName());

        assertEquals("C1", cMinor11thChord.notes()[0].getName());
        assertEquals("Eb1", cMinor11thChord.notes()[1].getName());
        assertEquals("G1", cMinor11thChord.notes()[2].getName());
        assertEquals("Bb1", cMinor11thChord.notes()[3].getName());
        assertEquals("D2", cMinor11thChord.notes()[4].getName());
        assertEquals("F2", cMinor11thChord.notes()[5].getName());
    }

    @Test
    public void dominantChordTest() throws Exception {
        Chord cDominant7thChord = new Chord(ChordType.DOMINANT_7TH, new Note());
        Chord cDominant9thChord = new Chord(ChordType.DOMINANT_9TH, new Note());

        assertEquals(new Note().getName(), cDominant7thChord.notes()[0].getName());
        assertEquals(new Note("E1").getName(), cDominant7thChord.notes()[1].getName());
        assertEquals(new Note("G1").getName(), cDominant7thChord.notes()[2].getName());
        assertEquals(new Note("Bb1").getName(), cDominant7thChord.notes()[3].getName());

        assertEquals(new Note().getName(), cDominant9thChord.notes()[0].getName());
        assertEquals(new Note("E1").getName(), cDominant9thChord.notes()[1].getName());
        assertEquals(new Note("G1").getName(), cDominant9thChord.notes()[2].getName());
        assertEquals(new Note("Bb1").getName(), cDominant9thChord.notes()[3].getName());
        assertEquals(new Note("D2").getName(), cDominant9thChord.notes()[4].getName());
    }

    @Test
    public void majorTriaInversionTest() throws Exception {
        Chord cMajorTriadChord = new Chord(ChordType.MAJOR_TRIAD, new Note());
        Note[] firstInversionNotes = cMajorTriadChord.invert(1);
        assertEquals("E1", firstInversionNotes[0].toString());
        assertEquals("G1", firstInversionNotes[1].toString());
        assertEquals("C2", firstInversionNotes[2].toString());

        Note[] secondInversionNotes = cMajorTriadChord.invert(2);
        assertEquals("G1", secondInversionNotes[0].toString());
        assertEquals("C2", secondInversionNotes[1].toString());
        assertEquals("E2", secondInversionNotes[2].toString());
    }

    @Test
    public void minorTiaInversionTest() throws Exception {
        Chord cMinorTriadChord = new Chord(ChordType.MINOR_TRIAD, new Note());
        Note[] firstInversionNotes = cMinorTriadChord.invert(1);
        assertEquals("Eb1", firstInversionNotes[0].toString());
        assertEquals("G1", firstInversionNotes[1].toString());
        assertEquals("C2", firstInversionNotes[2].toString());

        Note[] secondInversionNotes = cMinorTriadChord.invert(2);
        assertEquals("G1", secondInversionNotes[0].toString());
        assertEquals("C2", secondInversionNotes[1].toString());
        assertEquals("Eb2", secondInversionNotes[2].toString());
    }

    @Test
    public void major7thInversionTest() throws Exception {
        Chord cMajor7thChord = new Chord(ChordType.MAJOR_7TH, new Note());

        Note[] firstInversion = cMajor7thChord.invert(1);
        assertEquals("E1", firstInversion[0].toString());
        assertEquals("G1", firstInversion[1].toString());
        assertEquals("B1", firstInversion[2].toString());
        assertEquals("C2", firstInversion[3].toString());

        Note[] secondInversion = cMajor7thChord.invert(2);
        assertEquals("G1", secondInversion[0].toString());
        assertEquals("B1", secondInversion[1].toString());
        assertEquals("C2", secondInversion[2].toString());
        assertEquals("E2", secondInversion[3].toString());

        Note[] thirdInversion = cMajor7thChord.invert(3);
        assertEquals("B1", thirdInversion[0].toString());
        assertEquals("C2", thirdInversion[1].toString());
        assertEquals("E2", thirdInversion[2].toString());
        assertEquals("G2", thirdInversion[3].toString());
    }

    @Test
    public void minor7thInversionTest() throws Exception {
        Chord cMinor7thChord = new Chord(ChordType.MINOR_7TH, new Note());

        Note[] firstInversion = cMinor7thChord.invert(1);
        assertEquals("Eb1", firstInversion[0].toString());
        assertEquals("G1", firstInversion[1].toString());
        assertEquals("Bb1", firstInversion[2].toString());
        assertEquals("C2", firstInversion[3].toString());

        Note[] secondInversion = cMinor7thChord.invert(2);
        assertEquals("G1", secondInversion[0].toString());
        assertEquals("Bb1", secondInversion[1].toString());
        assertEquals("C2", secondInversion[2].toString());
        assertEquals("Eb2", secondInversion[3].toString());

        Note[] thirdInversion = cMinor7thChord.invert(3);
        assertEquals("Bb1", thirdInversion[0].toString());
        assertEquals("C2", thirdInversion[1].toString());
        assertEquals("Eb2", thirdInversion[2].toString());
        assertEquals("G2", thirdInversion[3].toString());
    }

    @Test
    public void major9thInversionTest() throws Exception {
        Chord cMajor9thChord = new Chord(ChordType.MAJOR_9TH, new Note());

        Note[] firstInversion = cMajor9thChord.invert(1);
        assertEquals("E1", firstInversion[0].toString());
        assertEquals("G1", firstInversion[1].toString());
        assertEquals("B1", firstInversion[2].toString());
        assertEquals("D2", firstInversion[3].toString());
        assertEquals("C2", firstInversion[4].toString());

        Note[] secondInversion = cMajor9thChord.invert(2);
        assertEquals("G1", secondInversion[0].toString());
        assertEquals("B1", secondInversion[1].toString());
        assertEquals("D2", secondInversion[2].toString());
        assertEquals("C2", secondInversion[3].toString());
        assertEquals("E2", secondInversion[4].toString());

        Note[] thirdInversion = cMajor9thChord.invert(3);
        assertEquals("B1", thirdInversion[0].toString());
        assertEquals("D2", thirdInversion[1].toString());
        assertEquals("C2", thirdInversion[2].toString());
        assertEquals("E2", thirdInversion[3].toString());
        assertEquals("G2", thirdInversion[4].toString());
    }

    @Test
    public void minor9thInversionTest() throws Exception {
        Chord cMinor9thChord = new Chord(ChordType.MINOR_9TH, new Note());

        Note[] firstInversion = cMinor9thChord.invert(1);
        assertEquals("Eb1", firstInversion[0].toString());
        assertEquals("G1", firstInversion[1].toString());
        assertEquals("Bb1", firstInversion[2].toString());
        assertEquals("D2", firstInversion[3].toString());
        assertEquals("C2", firstInversion[4].toString());

        Note[] secondInversion = cMinor9thChord.invert(2);
        assertEquals("G1", secondInversion[0].toString());
        assertEquals("Bb1", secondInversion[1].toString());
        assertEquals("D2", secondInversion[2].toString());
        assertEquals("C2", secondInversion[3].toString());
        assertEquals("Eb2", secondInversion[4].toString());

        Note[] thirdInversion = cMinor9thChord.invert(3);
        assertEquals("Bb1", thirdInversion[0].toString());
        assertEquals("D2", thirdInversion[1].toString());
        assertEquals("C2", thirdInversion[2].toString());
        assertEquals("Eb2", thirdInversion[3].toString());
        assertEquals("G2", thirdInversion[4].toString());
    }

    @Test
    public void dominant7thInversionTest() throws Exception {
        Chord cDominant7thChord = new Chord(ChordType.DOMINANT_7TH, new Note());

        Note[] firstInversion = cDominant7thChord.invert(1);
        assertEquals("E1", firstInversion[0].toString());
        assertEquals("G1", firstInversion[1].toString());
        assertEquals("Bb1", firstInversion[2].toString());
        assertEquals("C2", firstInversion[3].toString());

        Note[] secondInversion = cDominant7thChord.invert(2);
        assertEquals("G1", secondInversion[0].toString());
        assertEquals("Bb1", secondInversion[1].toString());
        assertEquals("C2", secondInversion[2].toString());
        assertEquals("E2", secondInversion[3].toString());

        Note[] thirdInversion = cDominant7thChord.invert(3);
        assertEquals("Bb1", thirdInversion[0].toString());
        assertEquals("C2", thirdInversion[1].toString());
        assertEquals("E2", thirdInversion[2].toString());
        assertEquals("G2", thirdInversion[3].toString());
    }

    @Test
    public void dominant9thInversionTest() throws Exception {
        Chord cDominant9thChord = new Chord(ChordType.DOMINANT_9TH, new Note());

        Note[] firstInversion = cDominant9thChord.invert(1);
        assertEquals("E1", firstInversion[0].toString());
        assertEquals("G1", firstInversion[1].toString());
        assertEquals("Bb1", firstInversion[2].toString());
        assertEquals("D2", firstInversion[3].toString());
        assertEquals("C2", firstInversion[4].toString());

        Note[] secondInversion = cDominant9thChord.invert(2);
        assertEquals("G1", secondInversion[0].toString());
        assertEquals("Bb1", secondInversion[1].toString());
        assertEquals("D2", secondInversion[2].toString());
        assertEquals("C2", secondInversion[3].toString());
        assertEquals("E2", secondInversion[4].toString());

        Note[] thirdInversion = cDominant9thChord.invert(3);
        assertEquals("Bb1", thirdInversion[0].toString());
        assertEquals("D2", thirdInversion[1].toString());
        assertEquals("C2", thirdInversion[2].toString());
        assertEquals("E2", thirdInversion[3].toString());
        assertEquals("G2", thirdInversion[4].toString());
    }

    @Test
    public void major11thInversionTest() throws Exception {
        Chord cMajor11thChord = new Chord(ChordType.MAJOR_11TH, new Note());

        Note[] firstInversion = cMajor11thChord.invert(1);
        assertEquals("E1", firstInversion[0].toString());
        assertEquals("G1", firstInversion[1].toString());
        assertEquals("B1", firstInversion[2].toString());
        assertEquals("D2", firstInversion[3].toString());
        assertEquals("F2", firstInversion[4].toString());
        assertEquals("C2", firstInversion[5].toString());

        Note[] secondInversion = cMajor11thChord.invert(2);
        assertEquals("G1", secondInversion[0].toString());
        assertEquals("B1", secondInversion[1].toString());
        assertEquals("D2", secondInversion[2].toString());
        assertEquals("F2", secondInversion[3].toString());
        assertEquals("C2", secondInversion[4].toString());
        assertEquals("E2", secondInversion[5].toString());

        Note[] thirdInversion = cMajor11thChord.invert(3);
        assertEquals("B1", thirdInversion[0].toString());
        assertEquals("D2", thirdInversion[1].toString());
        assertEquals("F2", thirdInversion[2].toString());
        assertEquals("C2", thirdInversion[3].toString());
        assertEquals("E2", thirdInversion[4].toString());
        assertEquals("G2", thirdInversion[5].toString());

        Note[] fourthInversion = cMajor11thChord.invert(4);
        assertEquals("D2", fourthInversion[0].toString());
        assertEquals("F2", fourthInversion[1].toString());
        assertEquals("C2", fourthInversion[2].toString());
        assertEquals("E2", fourthInversion[3].toString());
        assertEquals("G2", fourthInversion[4].toString());
        assertEquals("B2", fourthInversion[5].toString());
    }

    @Test
    public void minor11thInversionTest() throws Exception {
        Chord cMinor11thChord = new Chord(ChordType.MINOR_11TH, new Note());

        Note[] firstInversion = cMinor11thChord.invert(1);
        assertEquals("Eb1", firstInversion[0].toString());
        assertEquals("G1", firstInversion[1].toString());
        assertEquals("Bb1", firstInversion[2].toString());
        assertEquals("D2", firstInversion[3].toString());
        assertEquals("F2", firstInversion[4].toString());
        assertEquals("C2", firstInversion[5].toString());

        Note[] secondInversion = cMinor11thChord.invert(2);
        assertEquals("G1", secondInversion[0].toString());
        assertEquals("Bb1", secondInversion[1].toString());
        assertEquals("D2", secondInversion[2].toString());
        assertEquals("F2", secondInversion[3].toString());
        assertEquals("C2", secondInversion[4].toString());
        assertEquals("Eb2", secondInversion[5].toString());

        Note[] thirdInversion = cMinor11thChord.invert(3);
        assertEquals("Bb1", thirdInversion[0].toString());
        assertEquals("D2", thirdInversion[1].toString());
        assertEquals("F2", thirdInversion[2].toString());
        assertEquals("C2", thirdInversion[3].toString());
        assertEquals("Eb2", thirdInversion[4].toString());
        assertEquals("G2", thirdInversion[5].toString());

        Note[] fourthInversion = cMinor11thChord.invert(4);
        assertEquals("D2", fourthInversion[0].toString());
        assertEquals("F2", fourthInversion[1].toString());
        assertEquals("C2", fourthInversion[2].toString());
        assertEquals("Eb2", fourthInversion[3].toString());
        assertEquals("G2", fourthInversion[4].toString());
        assertEquals("Bb2", fourthInversion[5].toString());
    }
}
