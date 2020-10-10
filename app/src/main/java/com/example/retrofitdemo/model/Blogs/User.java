package com.example.retrofitdemo.model.Blogs;

public class User {
    private String createdAt;

    private String city;

    private String name;

    private String about;

    private String id;

    private String avatar;

    private String designation;

    private String blogId;

    private String lastname;

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAbout ()
    {
        return about;
    }

    public void setAbout (String about)
    {
        this.about = about;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getAvatar ()
    {
        return avatar;
    }

    public void setAvatar (String avatar)
    {
        this.avatar = avatar;
    }

    public String getDesignation ()
    {
        return designation;
    }

    public void setDesignation (String designation)
    {
        this.designation = designation;
    }

    public String getBlogId ()
    {
        return blogId;
    }

    public void setBlogId (String blogId)
    {
        this.blogId = blogId;
    }

    public String getLastname ()
    {
        return lastname;
    }

    public void setLastname (String lastname)
    {
        this.lastname = lastname;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [createdAt = "+createdAt+", city = "+city+", name = "+name+", about = "+about+", id = "+id+", avatar = "+avatar+", designation = "+designation+", blogId = "+blogId+", lastname = "+lastname+"]";
    }
}