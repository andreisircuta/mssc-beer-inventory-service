package common.events;

public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(){

    }
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
