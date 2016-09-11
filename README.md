#EtsyJavaApi

Etsy Java Api lets you configure oauth and make api calls based on the Etsy Api Framework.
Making call request and reading responses has never been easier. After you have configured your etsy service file you can simply build the object your looking for and add it with a simple method call. Will be working on adding the functionality for all method calls, some need tweaking.

#Getting Started
	First you will need to create a developer's app account from etsy. 
	Once you have done so you can use the client id and secret to start making your request. 
	You will need to configure EtsyService with these details, you can either hard 
	code them or put them in a seperate file and pull from there.
	
	private static final String client_id =<Enter client id>;
	private static final String client_secret = <Enter client secret>;
	private static final String access_token = <Enter access token>;
	private static final String token_secret = <Enter token secret>;
	
	/** NOTE you only have to do this once, record your access token and access token secret 
	    in a file or db for later use **/
	If you do not have your access token and secret you can initalize this by calling
	//First set the permissions we want to create for our app account
	String scope = "?scope=email_r%20listings_r%20listings_w"
	String client_id = <Client id from etsy>;
	String client_secret = <Client secret from etsy>;
	//Now we will invoke the access method.
	EtsyService.accessEtsyAccount(client_id,client_secret, null,null,scope);
	//Follow the onscreen instructions and save results.
	
	Thats it, your now ready to start communicating with etsy's api in java.
	

#Example 
		//Create a listing item, note by default we put items in a draft state unless you change it.
		Listing draft = new Listing();
		//Enter all required data for processing
		draft.setPrice("0.20");
		draft.setQuantity(new Double("0.0"));
		draft.setTitle("do not use");
		draft.setWhen_made("2010_2016");
		draft.setWho_made("i_did");
		draft.setDescription("fake");
		//Existing shipping template is needed
		draft.setShipping_template_id(new Long("18656190424"));
		//Here is where the magic happens and using scribe we can push a new listing to the etsy server.
		draft.createListing();
