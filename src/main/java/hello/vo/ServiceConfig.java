package hello.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "service-config")
public class ServiceConfig {
	private String accountsUrl;
	private String businessId;
	private String businessToken;
	private String activeCampaignUrl;
	private String adInsightsUrl;
	private String campaignInsightsUrl;
	private String adsetInsightsUrl;
	private String accountInsightsUrl;
	private String activeAdsetsUrl;
	private String activeAdsUrl;
	private String userId;
	private String pageAccountsUrl;
	private String userAccessToken;
	private String pageImpressionsInsightsUrl;
	private String pageEngagementInsightsUrl;
	private String pageViewInsightsUrl;
	private String pageViewVideoInsightsUrl;
	private String pageDemographicsInsightsUrl;
	private String pageReactionsInsightsUrl;
	private String pagePostsUrl;
	private String postImpressionsInsightsUrl;
	private String postEngagementInsightsUrl;
	private String postReactionsInsightsUrl;
	private String postVideoInsightsUrl;
	private int numOfDays;
	private String dateFormat;
	private String[] adInsightsFieldsToWrite;
	private String filePath;
	private String[] pagePostHeaders;
	private String pagePostFileHeaders;
	private String adInsightsFileHeaders;
}
