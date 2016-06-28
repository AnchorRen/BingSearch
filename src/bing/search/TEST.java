package bing.search;

import net.billylieurance.azuresearch.AzureSearchResultSet;
import net.billylieurance.azuresearch.AzureSearchWebQuery;
import net.billylieurance.azuresearch.AzureSearchWebResult;

public class TEST {

	public static void main(String[] args) {

		AzureSearchWebQuery aq = new AzureSearchWebQuery();
		aq.setAppid("HvD+ZUrsQ76zTzsnPmkmKX7ln3EYGRqbo0BksxJicBo"); // 我的bing
		aq.setQuery("OGC WMS Datasets");
		aq.setPerPage(50);
		aq.setPage(1);
		aq.doQuery();
		AzureSearchResultSet<AzureSearchWebResult> ars = aq.getQueryResult();
		for (AzureSearchWebResult anr : ars) {
			System.out.println(anr.getTitle());
			System.out.println(anr.getUrl());
			System.out.println(anr.getDisplayUrl());
			System.out.println(anr.getDescription());
			System.out.println("===================================");
		}
	}
}
