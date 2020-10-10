package com.example.retrofitdemo.model.Blogs;

public class BlogsMedia {
    /*"id":"1",
            "blogId":"1",
            "createdAt":"2020-04-16T22:43:18.606Z",
            "image":"https://s3.amazonaws.com/uifaces/faces/twitter/joe_black/128.jpg",
            "title":"maximized system",
            "url":"http://providenci.com"*/

    private String createdAt;

    private String image;

    private String id;

    private String title;

    private String blogId;

    private String url;

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getBlogId ()
    {
        return blogId;
    }

    public void setBlogId (String blogId)
    {
        this.blogId = blogId;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [createdAt = "+createdAt+", image = "+image+", id = "+id+", title = "+title+", blogId = "+blogId+", url = "+url+"]";
    }
}
