package ru.innopolis.deliveryhelper;

import ru.innopolis.deliveryhelper.Notifiable;

public interface OrderListMVC {
    interface View extends Notifiable {
        void addEntity(String orderId, String title, String address, String weight, String dimensions, String distanceFromWarehouse,  String type);
        void updateList();
        void hideProgressBar();
    }
    interface Controller {
        void loadOrderList();
    }
}
