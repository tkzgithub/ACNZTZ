package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

/*
 *Project: Assurity Consulting Practical Assessment
 * Author: Tom Zimba
 * Purpose: This class is for defining all Fees variables, getters and setters
 * @version 1.0.0
 * @since 27 May 2023

 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fees {
//declaring Fees private variables
    private float Bundle;
    private float EndDate;
    private float Feature;
    private float Gallery;
    private float Listing;
    private float Reserve;
    private float Subtitle;
    private float TenDays;

    //ListingFeeTiers is returning MinimumTierPrice and
    // FixedFee, use ArrayList to reduce maintenance time
    ArrayList< Object > listingFeeTiers = new ArrayList< Object >();
    private float SecondCategory;


    // Getter Methods for Fees

    public float getBundle() {
        return Bundle;
    }

    public float getEndDate() {
        return EndDate;
    }

    public float getFeature() {
        return Feature;
    }

    public float getGallery() {
        return Gallery;
    }

    public float getListing() {
        return Listing;
    }

    public float getReserve() {
        return Reserve;
    }

    public float getSubtitle() {
        return Subtitle;
    }

    public float getTenDays() {
        return TenDays;
    }

    public float getSecondCategory() {
        return SecondCategory;
    }

    // Setter Methods

    public void setBundle(float Bundle) {
        this.Bundle = Bundle;
    }

    public void setEndDate(float EndDate) {
        this.EndDate = EndDate;
    }

    public void setFeature(float Feature) {
        this.Feature = Feature;
    }

    public void setGallery(float Gallery) {
        this.Gallery = Gallery;
    }

    public void setListing(float Listing) {
        this.Listing = Listing;
    }

    public void setReserve(float Reserve) {
        this.Reserve = Reserve;
    }

    public void setSubtitle(float Subtitle) {
        this.Subtitle = Subtitle;
    }

    public void setTenDays(float TenDays) {
        this.TenDays = TenDays;
    }

    public void setSecondCategory(float SecondCategory) {
        this.SecondCategory = SecondCategory;
    }
}
