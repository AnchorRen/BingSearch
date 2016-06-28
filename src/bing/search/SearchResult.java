package bing.search;

public class SearchResult {

	private String id;
	private String url;
	private String description;
	private String title;
	private String displayUrl;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDisplayUrl() {
		return displayUrl;
	}

	public void setDisplayUrl(String displayUrl) {
		this.displayUrl = displayUrl;
	}

	@Override
	public String toString() {
		return "SearchResult [id=" + id + ", url=" + url + ", description=" + description + ", title=" + title
				+ ", displayUrl=" + displayUrl + "]";
	}

}
