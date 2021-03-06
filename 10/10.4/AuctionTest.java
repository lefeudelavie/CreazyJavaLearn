public class AuctionTest
{
    private double initPrice = 30.0;
    
    public void bid(String bidPrice)
        throws AuctionException
    {
        double d = 0.0;
        try
        {
            d = Double.parseDouble(bidPrice);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new AuctionException("竞拍价必须是合法的数值，不能是其他字符。");
        }

        if ( d < initPrice)
        {
            throw new AuctionException("竞拍价格低于起拍价");
        }

        initPrice = d;
    }


    public static void main(String[] args)
    {
        AuctionTest at = new AuctionTest();
        try
        {
            at.bid("11");
        }
        catch (AuctionException ae)
        {
            System.err.println(ae.getMessage());
        }
    }
}
