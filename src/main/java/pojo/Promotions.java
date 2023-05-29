package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

/*
 *Project: Assurity Consulting Practical Assessment
 * Author: Tom Zimba
 * Purpose: This class is for getting the response from the API after
 * querying with the GET method
 * @version 1.0.0
 * @since 29 May 2023

 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Promotions {
/*
Serialize the fields in the Promotions object
 */
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

/*
*Creating getter and corresponding setter method
*so that none will be missed
 */
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
