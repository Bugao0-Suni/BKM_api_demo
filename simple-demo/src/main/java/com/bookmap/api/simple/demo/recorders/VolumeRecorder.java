package com.bookmap.api.simple.demo.recorders;

import velox.api.layer1.annotations.Layer1ApiVersion;
import velox.api.layer1.annotations.Layer1ApiVersionValue;
import velox.api.layer1.annotations.Layer1SimpleAttachable;
import velox.api.layer1.annotations.Layer1StrategyName;
import velox.api.layer1.data.InstrumentInfo;
import velox.api.layer1.layers.utils.OrderBook;
import velox.api.layer1.simplified.Api;
import velox.api.layer1.simplified.Bar;
import velox.api.layer1.simplified.BarDataListener;
import velox.api.layer1.simplified.CustomModule;
import velox.api.layer1.simplified.InitialState;
import velox.api.layer1.simplified.Intervals;

@Layer1SimpleAttachable
@Layer1StrategyName("Volume Recorder")
@Layer1ApiVersion(Layer1ApiVersionValue.VERSION1)
public class VolumeRecorder extends DataRecorderBase implements CustomModule, BarDataListener {

    @Override
    public void onBar(OrderBook orderBook, Bar bar) {
        writeObjects(bar.getVolumeBuy(), bar.getVolumeSell());
    }

    @Override
    public long getInterval() {
        return Intervals.INTERVAL_1_SECOND;
    }

    @Override
    public void initialize(String alias, InstrumentInfo info, Api api, InitialState initialState) {
    }

    @Override
    protected String getFilename() {
        return "Volume_" + System.currentTimeMillis() + ".txt";
    }

}
