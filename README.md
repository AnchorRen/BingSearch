# BingSearch
封装好的Bing关键字搜索工具，
通过关键字，返回Bing搜索的Url链接信息等。
可以配合爬虫使用，作为Url种子点来源。

### 示例：

```
public static void main(String[] args) {

		AzureSearchWebQuery aq = new AzureSearchWebQuery();
		aq.setAppid("HvD+ZUrsQ76zTzsnPmkmKX7ln3EYGRqbo0BksxJicBo"); // bing search KEY
		aq.setQuery("OGC WMS Datasets"); //keywords
		aq.setPerPage(50); //每页显示的条数，最多50条
		aq.setPage(1);//返回第几页
		aq.doQuery(); //执行查询
		AzureSearchResultSet<AzureSearchWebResult> ars = aq.getQueryResult(); //获得查询结果集
		for (AzureSearchWebResult anr : ars) {
			System.out.println(anr.getTitle()); 
			System.out.println(anr.getUrl()); 
			System.out.println(anr.getDisplayUrl()); 
			System.out.println(anr.getDescription());
			System.out.println("===================================");
		}
	}
```
### 结果输出片段：

```
OGC WMS (Dataset) - Cadcorp
http://help.cadcorp.com/en/7.1/sis/help/Datasets_AOgcWmsDataset.html
help.cadcorp.com/en/7.1/sis/help/Datasets_AOgcWmsDataset.html
OGC WMS. The OpenGIS® Web Map Service Interface Standard (WMS) provides a simple HTTP interface for requesting geo-registered map images from one or more distributed ...
===================================
NEDDC INSPIRE OGC WMS service - Datasets
https://data.gov.uk/dataset/neddc-inspire-ogc-wms-service
https://data.gov.uk/dataset/neddc-inspire-ogc-wms-service
Datasets; NEDDC INSPIRE OGC WMS service; Contacts. Enquiries: Email: ... NEDDC INSPIRE OGC WMS service . Published by North East Derbyshire District Council.
===================================
```
### 其他参数：

```
String appId; // Bing search Key
String latitude; //经度
String longitude; //纬度
String market; //应用市场
Integer page; //第几页
Integer perPage; //每页返回结果数
boolean processHTTPRequests; //是否通过Http请求
String query; //搜索关键字
String queryExtra;//其他条件
String queryOption;//搜索选项
Integer skip; //跳过
String webFileType; //web文件类型
String webSearchOptions; //搜索选项
```
关于参数的默认值和更详细的信息，请查阅[Bing Search API](https://datamarket.azure.com/dataset/bing/search#schema) 

### 关于market：

    Bing 会针对不同国家对不同关键字会返回更贴近本国的搜索结果。
    这个market参数就是设置在哪个国家下的搜索结果。
    目前Bing所有的market信息如下所示：
    
    
```
Market Name     Language-Country/Region
ar-XA	        Arabic – Arabia
bg-BG       	Bulgarian – Bulgaria
cs-CZ       	Czech – Czech Republic
da-DK	        Danish – Denmark
de-AT       	German – Austria
de-CH       	German – Switzerland
de-DE       	German – Germany
el-GR       	Greek – Greece
en-AU       	English – Australia
en-CA       	English – Canada
en-GB       	English – United Kingdom
en-ID       	English – Indonesia
en-IE	        English – Ireland
en-IN       	English – India
en-MY       	English – Malaysia
en-NZ       	English – New Zealand
en-PH       	English – Philippines
en-SG       	English – Singapore
en-US       	English – United States
en-XA       	English – Arabia
en-ZA       	English – South Africa
es-AR       	Spanish – Argentina
es-CL       	Spanish – Chile
es-ES       	Spanish – Spain
es-MX       	Spanish – Mexico
es-US       	Spanish – United States
es-XL       	Spanish – Latin America
et-EE       	Estonian – Estonia
fi-FI       	Finnish – Finland
fr-BE       	French – Belgium
fr-CA       	French – Canada
fr-CH       	French – Switzerland
fr-FR       	French – France
he-IL       	Hebrew – Israel
hr-HR       	Croatian – Croatia
hu-HU       	Hungarian – Hungary
it-IT       	Italian – Italy
ja-JP       	Japanese – Japan
ko-KR       	Korean – Korea
lt-LT       	Lithuanian – Lithuania
lv-LV       	Latvian – Latvia
nb-NO       	Norwegian – Norway
nl-BE       	Dutch – Belgium
nl-NL       	Dutch – Netherlands
pl-PL       	Polish – Poland
pt-BR       	Portuguese – Brazil
pt-PT       	Portuguese – Portugal
ro-RO       	Romanian – Romania
ru-RU       	Russian – Russia
sk-SK       	Slovak – Slovak Republic
sl-SL       	Slovenian – Slovenia
sv-SE       	Swedish – Sweden
th-TH       	Thai – Thailand
tr-TR       	Turkish – Turkey
uk-UA       	Ukrainian – Ukraine
zh-CN       	Chinese – China
zh-HK       	Chinese – Hong Kong SAR
zh-TW       	Chinese – Taiwan

```
### 关于搜索结果数：

    使用baidu、Google、Bing 过程中，每次搜索结果都会显示：使用xxx秒，返回xxx条结果。
    但是，我们实际上能够看到的结果数都不会超过1000条。这些搜索引擎会根据它们各自的排序算法，
    返回特定数量的结果。实际使用Bing Search过程中，
    每个关键字返回的不同结果不会超过900条。通过设置perPage 和 Page属性，
    我们可以达到翻页的效果。
    但是当设置参数超过对这个关键字的返回数量的时候，也会返回结果，但是结果是重复的。
