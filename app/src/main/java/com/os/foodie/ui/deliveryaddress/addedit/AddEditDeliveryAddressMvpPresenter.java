package com.os.foodie.ui.deliveryaddress.addedit;

import com.os.foodie.data.network.model.deliveryaddress.add.AddDeliveryAddressRequest;
import com.os.foodie.data.network.model.deliveryaddress.update.UpdateAddressRequest;
import com.os.foodie.ui.base.MvpPresenter;

public interface AddEditDeliveryAddressMvpPresenter<V extends AddEditDeliveryAddressMvpView> extends MvpPresenter<V> {

    void addDeliverAddress(AddDeliveryAddressRequest addDeliveryAddressRequest);

    void updateDeliverAddress(UpdateAddressRequest updateAddressRequest);

    void dispose();
}