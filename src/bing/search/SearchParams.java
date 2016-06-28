package bing.search;

/**
 * Bing 搜索参数类
 * 
 * @author REN
 * @date 2016年6月28日 下午10:07:28
 */
public class SearchParams {

	private final String appId;
	private final String latitude;
	private final String longitude;
	private final String market;
	private final int page;
	private final Integer perPage;
	private final boolean processHTTPRequests;
	private final String query;
	private final String queryExtra;
	private final String queryOption;
	private final Integer skip;
	private final String webFileType;
	private final String webSearchOptions;
	
	public String getAppId() {
		return appId;
	}


	public String getLatitude() {
		return latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public String getMarket() {
		return market;
	}


	public int getPage() {
		return page;
	}


	public Integer getPerPage() {
		return perPage;
	}


	public boolean isProcessHTTPRequests() {
		return processHTTPRequests;
	}


	public String getQuery() {
		return query;
	}


	public String getQueryExtra() {
		return queryExtra;
	}


	public String getQueryOption() {
		return queryOption;
	}


	public Integer getSkip() {
		return skip;
	}


	public String getWebFileType() {
		return webFileType;
	}


	public String getWebSearchOptions() {
		return webSearchOptions;
	}


	/**
	 * 构造函数，传递参数Builder对象。为静态内部类
	 * @param builder
	 */
	private SearchParams(Builder builder) {
		appId = builder.appId;
		latitude = builder.latitude;
		longitude = builder.longitude;
		market = builder.market;
		page = builder.page;
		perPage = builder.perPage;
		processHTTPRequests = builder.processHTTPRequests;
		query = builder.query;
		queryExtra = builder.queryExtra;
		queryOption = builder.queryOption;
		skip = builder.skip;
		webFileType = builder.webFileType;
		webSearchOptions = builder.webSearchOptions;
	}
	
	
	public static class Builder{
		
		private  String appId;
		private  String latitude;
		private  String longitude;
		private  String market;
		private  int page = 10;
		private  int perPage = 50;
		private  boolean processHTTPRequests;
		private  String query;
		private  String queryExtra;
		private  String queryOption;
		private  int skip;
		private  String webFileType;
		private  String webSearchOptions;
		
		public Builder(String query, int page, int perPage){
			this.query = query;
			this.page = page;
			this.perPage = perPage;
		}
		
		public Builder appId(String val){
			appId = val;
			return this;
		}
		
		public Builder latitude(String val){
			latitude = val;
			return this;
		}
		public Builder processHTTPRequests(boolean val){
			processHTTPRequests = val;
			return this;
		}
		public Builder longitude(String val){
			longitude = val;
			return this;
		}
		public Builder market(String val){
			market = val;
			return this;
		}
		public Builder skip(int val){
			skip = val;
			return this;
		}
		public Builder queryExtra(String val){
			queryExtra = val;
			return this;
		}
		public Builder webFileType(String val){
			webFileType = val;
			return this;
		}
		public Builder webSearchOptions(String val){
			webSearchOptions = val;
			return this;
		}
		
		/**
		 * 调用build方法能够 生成不可变的对象。
		 * @return
		 */
		public SearchParams build(){
			return new SearchParams(this);
		}
	}
}
