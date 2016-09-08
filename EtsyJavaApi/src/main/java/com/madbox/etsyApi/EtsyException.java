package com.madbox.etsyApi;

public class EtsyException extends Exception
{

    private static final long serialVersionUID = 1997753363232807009L;

		public EtsyException()
		{
		}

		public EtsyException(String message)
		{
			super(message);
		}

		public EtsyException(Throwable cause)
		{
			super(cause);
		}

		public EtsyException(String message, Throwable cause)
		{
			super(message, cause);
		}

		public EtsyException(String message, Throwable cause, 
                                           boolean enableSuppression, boolean writableStackTrace)
		{
			super(message, cause, enableSuppression, writableStackTrace);
		}

}
