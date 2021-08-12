package entities;

import java.util.Set;

public class Club {
    private String clubId;
    private String name;
    private String description;
    private String school;
    private Set<DMSV> dmsvs;

    public Club(String clubId, String name, String description, String school) {
        this.clubId = clubId;
        this.name = name;
        this.description = description;
        this.school = school;
    }

    public Set<DMSV> getDmsvs() {
        return dmsvs;
    }

    public void setDmsvs(Set<DMSV> dmsvs) {
        this.dmsvs = dmsvs;
    }

    public Club(String clubId, String name, String description, String school, Set<DMSV> dmsvs) {
        this.clubId = clubId;
        this.name = name;
        this.description = description;
        this.school = school;
        this.dmsvs = dmsvs;
    }

    public Club() {

    }

    public String getClubId() {
        return clubId;
    }

    public void setClubId(String clubId) {
        this.clubId = clubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
