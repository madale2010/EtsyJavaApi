package etsy;

import javax.servlet.ServletException;

public class EtsyException extends ServletException
{

    private static final long serialVersionUID = 1997753363232807009L;

		public EtsyException()
		{
			super();
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

}
