public class Post
{
	private String linkToImage;
    private String description;
    private int numberOfLikes;	
 
  public Post(String linkToImage, String description)
  {
	  this.linkToImage = linkToImage;
	  this.description = description;
	  this.numberOfLikes = 0;
  }
  public String getLinkToImage()
  {
	  return this.linkToImage = linkToImage;
  }
  public void setLinkToImage(String setLinkToImage)
  {
	  this.linkToImage = linkToImage;
  }
  public String getDescription()
  {
	  return this.description;
  }
  public void setDescription(String description)
  {
	  this.description = description; 
  }
  public int getNumberOfLikes()
  {
	  return this.numberOfLikes = numberOfLikes;
  }
  public void setNumberOfLikes(int numberOfLikes)
  {
	  this.numberOfLikes = numberOfLikes;
  }
  public void like()
  {
	  this.numberOfLikes++;
  }

@Override
  public String toString()
  {
	  return "Post{" + "linkToImage: " + linkToImage + ", description: " + description + ", Likes:" + numberOfLikes + "}";
  }
   public static void main(String[] args)
   {
      Post post1 = new Post("image1", "First status");
      post1.setNumberOfLikes(23);
      System.out.println(post1);
      	 
   }  
}