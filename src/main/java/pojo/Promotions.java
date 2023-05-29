package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Promotions {

    @SerializedName("Id")
    int Id;

    @SerializedName("Name")
    String Name;

    @SerializedName("Description")
    String Description;

    @SerializedName("Price")
    int Price;

    @SerializedName("MinimumPhotoCount")
    int MinimumPhotoCount;


    public void setId(int Id) {
        this.Id = Id;
    }
    public int getId() {
        return Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    public String getDescription() {
        return Description;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    public int getPrice() {
        return Price;
    }

    public void setMinimumPhotoCount(int MinimumPhotoCount) {
        this.MinimumPhotoCount = MinimumPhotoCount;
    }
    public int getMinimumPhotoCount() {
        return MinimumPhotoCount;
    }
}
