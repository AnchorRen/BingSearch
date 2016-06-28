package bing.search;

import java.util.ArrayList;

import net.billylieurance.azuresearch.AzureSearchResultSet;
import net.billylieurance.azuresearch.AzureSearchWebQuery;
import net.billylieurance.azuresearch.AzureSearchWebResult;

public class Search {
	
	public static ArrayList<SearchResult> search(SearchParams params){
		
		AzureSearchWebQuery aq = new AzureSearchWebQuery();
		aq.setAppid(params.getAppId());
		aq.setLatitude(params.getLatitude());
		aq.setLongitude(params.getLongitude());
		aq.setMarket(params.getMarket());
		aq.setPage(params.getPage());
		aq.setPerPage(params.getPerPage());
		aq.setProcessHTTPResults(params.isProcessHTTPRequests());
		aq.setQuery(params.getQuery());
		aq.setQueryExtra(params.getQueryExtra());
		aq.setQueryOption(params.getQueryOption());
		aq.setSkip(params.getSkip());
		aq.setWebFileType(params.getWebFileType());
		aq.setWebSearchOptions(params.getWebSearchOptions());
		
		aq.doQuery();
		
		ArrayList<SearchResult> list = new ArrayList<>();
		
		AzureSearchResultSet<AzureSearchWebResult> ars = aq.getQueryResult();
		for (AzureSearchWebResult anr : ars) {
			
			SearchResult result = new SearchResult();
			result.setDescription(anr.getDescription());
			result.setDisplayUrl(anr.getDisplayUrl());
			result.setId(anr.getId());
			result.setTitle(anr.getTitle());
			result.setUrl(anr.getUrl());
			
			list.add(result);
		}
		
		return list;
	}
	
}
