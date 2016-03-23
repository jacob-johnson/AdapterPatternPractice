

public class YouTubeAdapter implements SocialMediaEntry{

	private YouTubeVideo myYouTubeVideo;

	public YouTubeAdapter(YouTubeVideo aYouTubeVideo){
		myYouTubeVideo = aYouTubeVideo;
	}

	public String getUser(){
		return myYouTubeVideo.getAuthor();
	}

    public String getPostText(){

    	String newPostText = myYouTubeVideo.getTitle() + 
    	myYouTubeVideo.getDescription();

    	return newPostText;
    }

}

