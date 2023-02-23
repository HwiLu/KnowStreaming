package com.xiaojukeji.know.streaming.km.rebalance.optimizer.goals;

import com.xiaojukeji.know.streaming.km.rebalance.model.Resource;

/**
 * @author leewei
 * @date 2022/5/24
 */
public class NetworkOutboundDistributionGoal extends ResourceDistributionGoal {

    @Override
    protected Resource resource() {
        return Resource.NW_OUT;
    }

    @Override
    public String name() {
        return NetworkOutboundDistributionGoal.class.getSimpleName();
    }

}

