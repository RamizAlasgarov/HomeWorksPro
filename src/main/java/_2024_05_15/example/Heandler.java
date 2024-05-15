package _2024_05_15.example;


import java.util.Set;

/**
 * 3. Написать класс Handler для хранения команд, результатов как хотите и каких хотите DS лишь бы всех данных
 */
public class Heandler {
    Set<Team<Pupil>> pupilsTeam = Generator.generate25TeamPupil();
    Set<Team<Adult>> adultsTeam = Generator.generate25TeamAdults();
    Set<Team<Teenager>> teenagerTeam = Generator.generate25TeamTeenagers();
}
