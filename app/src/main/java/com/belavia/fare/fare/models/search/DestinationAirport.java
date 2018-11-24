package com.belavia.fare.fare.models.search;

public class DestinationAirport
{
    private String trafficConferenceName;

    private String countryName;

    private String iataRegionCode;

    private String timeZoneInfo;

    private String cityId;

    private String countryCode;

    private String trafficConferenceCode;

    private String iataRegionName;

    private String iataCountryCode;

    private String geonameId;

    public String getTrafficConferenceName ()
    {
        return trafficConferenceName;
    }

    public void setTrafficConferenceName (String trafficConferenceName)
    {
        this.trafficConferenceName = trafficConferenceName;
    }

    public String getCountryName ()
    {
        return countryName;
    }

    public void setCountryName (String countryName)
    {
        this.countryName = countryName;
    }

    public String getIataRegionCode ()
    {
        return iataRegionCode;
    }

    public void setIataRegionCode (String iataRegionCode)
    {
        this.iataRegionCode = iataRegionCode;
    }

    public String getTimeZoneInfo ()
    {
        return timeZoneInfo;
    }

    public void setTimeZoneInfo (String timeZoneInfo)
    {
        this.timeZoneInfo = timeZoneInfo;
    }

    public String getCityId ()
    {
        return cityId;
    }

    public void setCityId (String cityId)
    {
        this.cityId = cityId;
    }

    public String getCountryCode ()
    {
        return countryCode;
    }

    public void setCountryCode (String countryCode)
    {
        this.countryCode = countryCode;
    }

    public String getTrafficConferenceCode ()
    {
        return trafficConferenceCode;
    }

    public void setTrafficConferenceCode (String trafficConferenceCode)
    {
        this.trafficConferenceCode = trafficConferenceCode;
    }

    public String getIataRegionName ()
    {
        return iataRegionName;
    }

    public void setIataRegionName (String iataRegionName)
    {
        this.iataRegionName = iataRegionName;
    }

    public String getIataCountryCode ()
    {
        return iataCountryCode;
    }

    public void setIataCountryCode (String iataCountryCode)
    {
        this.iataCountryCode = iataCountryCode;
    }

    public String getGeonameId ()
    {
        return geonameId;
    }

    public void setGeonameId (String geonameId)
    {
        this.geonameId = geonameId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [trafficConferenceName = "+trafficConferenceName+", countryName = "+countryName+", iataRegionCode = "+iataRegionCode+", timeZoneInfo = "+timeZoneInfo+", cityId = "+cityId+", countryCode = "+countryCode+", trafficConferenceCode = "+trafficConferenceCode+", iataRegionName = "+iataRegionName+", iataCountryCode = "+iataCountryCode+", geonameId = "+geonameId+"]";
    }
}
