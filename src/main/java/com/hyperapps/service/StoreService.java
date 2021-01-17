package com.hyperapps.service;

import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

import com.hyperapps.model.Category;
import com.hyperapps.model.CategoryTree;
import com.hyperapps.model.DeliverySettings;
import com.hyperapps.model.Designation;
import com.hyperapps.model.OfferHistoryData;
import com.hyperapps.model.Product;
import com.hyperapps.model.Store;
import com.hyperapps.model.WelcomeMessage;

@Service
public interface StoreService {
	
	public List<WelcomeMessage> getWelcomeMessages(String token);

	public boolean updateWelcomeMessage(int user_id, String message, int designation);

	public List<Designation> getDesignation();

	public List<DeliverySettings> getDeliverySettingsDetails(int storeId);

	public boolean updateStoreRunningStatus(int storeId,int running_status);

	public boolean updateTaxInfo(int store_id, int tax_status, int tax_percentage, String tax_gst);
	
	public Store getStoreBusinessTime(int storeId,Store store);

	public boolean addUpdatedStandardDeliverSettingsDetails(int store_id, int delivery_type, double min_order_amount,
			double delivery_charge, double free_delivery_above, String delivery_areas, int home_delivery,int updateFlag);

	public List<OfferHistoryData> getOnGoingOfferDetails(int store_id);

	public List<OfferHistoryData> getHistoryOffer(int store_id);

	public boolean addOffer(OfferHistoryData offer);
	
	public boolean updateOffer(OfferHistoryData offer);

	public boolean resumeOffer(String offer_valid, String offer_start_date, int id);

	public boolean removeOffer(int id);

	public HashMap<String, Integer> rewardShow(int storeId);

	public boolean updateRewardPoints(int store_id, int reward_point);
	
		
}
