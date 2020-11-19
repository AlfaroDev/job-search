package com.platzi.jobsearch;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class JobPosition {
    private String id;

    private String type;

    private String url;

    @SerializedName("created_at")
    private String cratedAt;

    private String company;

    @SerializedName("company_url")
    private String companyURL;

    private String title;

    private String location;

    private String description;

    @SerializedName("company_logo")
    private String companyLogo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(String cratedAt) {
        this.cratedAt = cratedAt;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(url, that.url) &&
                Objects.equals(cratedAt, that.cratedAt) &&
                Objects.equals(company, that.company) &&
                Objects.equals(companyURL, that.companyURL) &&
                Objects.equals(title, that.title) &&
                Objects.equals(location, that.location) &&
                Objects.equals(description, that.description) &&
                Objects.equals(companyLogo, that.companyLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, url, cratedAt, company, companyURL, title, location, description, companyLogo);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", cratedAt='" + cratedAt + '\'' +
                ", company='" + company + '\'' +
                ", companyURL='" + companyURL + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                '}';
    }
}
