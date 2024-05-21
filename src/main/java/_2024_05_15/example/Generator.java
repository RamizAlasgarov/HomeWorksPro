package _2024_05_15.example;

import com.github.javafaker.Faker;

import java.util.*;

public class Generator {
    private static final Faker FAKER = new Faker();
    private static final Random random = new Random();
    public static Set<Team<Pupil>> generate25TeamPupil(){
        Set<Team<Pupil>> pupils = new HashSet<>();
        for (int i = 0; i < 3 ; i++) {
            Team<Pupil> pupilTeam = new Team<>((FAKER.team().name()));
            pupilTeam.setList(generateFourParticipant());
            pupils.add(pupilTeam);
        }
        return pupils;
    }

    public static Set<Team<Teenager>> generate25TeamTeenagers(){
        Set<Team<Teenager>> teenager = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Team<Teenager> teenagerTeam = new Team<>(FAKER.team().name());
            teenagerTeam.setList(generateFourTeenager());
            teenager.add(teenagerTeam);
        }
        return teenager;
    }

    public static Set<Team<Adult>> generate25TeamAdults(){
        Set<Team<Adult>> adults = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Team<Adult> adultTeam = new Team<>(FAKER.team().name());
            adultTeam.setList(generateFourAdult());
            adults.add(adultTeam);
        }
        return adults;
    }

    private static List<Pupil> generateFourParticipant() {
        List<Pupil> pupilList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            pupilList.add(new Pupil(FAKER.name().name(), random.nextInt(5,10)));
        }
        return pupilList;
    }
    private static List<Teenager> generateFourTeenager() {
        List<Teenager> teenager = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            teenager.add(new Teenager(FAKER.team().name(),random.nextInt(10,20)));
        }
        return teenager;
    }

    private static List<Adult> generateFourAdult(){
        List<Adult> adultList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adultList.add(new Adult(FAKER.team().name(),random.nextInt(20,120)));
        }
        return adultList;
    }

    private static List<Pupil> generateFourPupil(){
        List<Pupil> pupilList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            pupilList.add(new Pupil(FAKER.team().name(),random.nextInt(20,120)));
        }
        return pupilList;
    }


}
