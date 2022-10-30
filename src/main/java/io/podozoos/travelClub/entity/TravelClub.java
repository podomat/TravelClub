package io.podozoos.travelClub.entity;

import io.podozoos.travelClub.util.DateUtil;

import java.util.UUID;

public class TravelClub {
    //Fields
    private static final int MINIMUM_NAME_LENGTH = 3;
    private static final int MINIMUM_INTRO_LENGTH = 10;

    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;

    //Constructors
    private TravelClub() {
        this.id = UUID.randomUUID().toString();
    }

    public TravelClub(String clubName, String intro) {
        this();
        setClubName(clubName);
        setIntro(intro);
        this.foundationDay = DateUtil.today();
    }

    //Methods
    public void setClubName(String clubName) {
        if( clubName.length() < MINIMUM_NAME_LENGTH ) {
            System.out.println("Club Name should be longer than " + MINIMUM_NAME_LENGTH);
            return;
        }
        this.clubName = clubName;
    }

    public void setIntro(String intro) {
        if( intro.length() < MINIMUM_INTRO_LENGTH ) {
            System.out.println("Intro should be longer than " + MINIMUM_INTRO_LENGTH);
            return;
        }
        this.intro = intro;
    }

    public String getClubName() {
        return this.clubName;
    }

    public String getIntro() { return this.intro; }

    public String getId() { return this.id; }

    public String getFoundationDay() { return this.foundationDay; }

    public static TravelClub getSample() {
        return new TravelClub("Sample Club", "Sample Club Intro");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Travel Club ID : ").append(id);
        builder.append(", ClubName : ").append(clubName);
        builder.append(", Intro : ").append(intro);
        builder.append(", Foundation Day : ").append(foundationDay);

        return builder.toString();
    }
}
