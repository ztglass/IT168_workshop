
public class Pet {
    private String name;
    private String petType;
    private boolean favorite;

    public Pet(String initName, String initPetType, boolean initFavorite) {
        name = initName;
        petType = initPetType;
        favorite = initFavorite;
    }

    public String getName() {
        return name;
    }

    public String getPetType() {
        return petType;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setPetType(String newPetType) {
        petType = newPetType;
    }

    public void setFavorite(Boolean newFavorite) {
        favorite = newFavorite;
    }

}