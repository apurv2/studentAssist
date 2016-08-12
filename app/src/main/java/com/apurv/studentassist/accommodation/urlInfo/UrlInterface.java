package com.apurv.studentassist.accommodation.urlInfo;

import java.io.UnsupportedEncodingException;

/**
 * Created by apurv on 6/7/15.
 */
public interface UrlInterface {

    public String getApartmentNamesUrl(String aptType);


    public String getSearchAccommodationAdds(String leftSpinner, String rightSpinner) throws UnsupportedEncodingException;

    public String getAdvancedSearchAccommodationAdds(String apartmentName, String gender) throws UnsupportedEncodingException;

    public String getUserPosts(String userId) throws UnsupportedEncodingException;

    public String getAddNewAptUrl(String apartmentName, String apartmentType) throws UnsupportedEncodingException;

    public String getPostAccUrl(String apartmentName, String noOfRooms, String noOfVacancies,
                                String lookingFor, String userId, String cost, String notes
    ) throws UnsupportedEncodingException;

    public String getNotificationSettingsUrl(String access_token)
            throws UnsupportedEncodingException;

    public String getDeleteNotificationSettingUrl(int notificationId)
            throws UnsupportedEncodingException;

    public String getInsertNotificationsUrl()
            throws UnsupportedEncodingException;


    public String createUser(String accessToken,String instanceId);

    public String getDeleteAccommodationPostUrl(String addId) throws UnsupportedEncodingException;

    public String getAirportUrl() throws UnsupportedEncodingException;

    public String getRecentListCheckerUrl(String json) throws UnsupportedEncodingException;

    public String getApartmentNamesWithTypeUrl() throws UnsupportedEncodingException;

    public String setUserVisitedAdds() throws UnsupportedEncodingException;


}
