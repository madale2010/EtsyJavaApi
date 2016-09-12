package etsy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.scribejava.core.builder.api.DefaultApi10a;
import com.github.scribejava.core.model.OAuth1RequestToken;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtsyApi extends DefaultApi10a {

	private static final String AUTHORIZE_URL = "https://www.etsy.com/oauth/signin";
	private static final String REQUEST_TOKEN_RESOURCE = "openapi.etsy.com/v2/oauth/request_token";
	private static final String ACCESS_TOKEN_RESOURCE = "openapi.etsy.com/v2/oauth/access_token";

	protected EtsyApi() {
	}

	private static class InstanceHolder {
		private static final EtsyApi INSTANCE = new EtsyApi();
	}

	public static EtsyApi instance() {
		return InstanceHolder.INSTANCE;
	}

	public String getAccessTokenEndpoint() {
		return "https://" + ACCESS_TOKEN_RESOURCE;
	}

	public String getRequestTokenEndpoint() {
		return "https://" + REQUEST_TOKEN_RESOURCE;
	}

	public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
		return String.format(AUTHORIZE_URL, requestToken.getToken());
	}

	/**
	 * Twitter 'friendlier' authorization endpoint for OAuth.
	 *
	 * Uses SSL.
	 */
	public static class Authenticate extends EtsyApi {

		private static final String AUTHENTICATE_URL = "https://openapi.etsy.com/v2/oauth/authenticate?oauth_token=%s";

		private Authenticate() {
		}

		private static class InstanceHolder {
			private static final Authenticate INSTANCE = new Authenticate();
		}

		public static Authenticate instance() {
			return InstanceHolder.INSTANCE;
		}

		@Override
		public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
			return String.format(AUTHENTICATE_URL, requestToken.getToken());
		}
	}
}
