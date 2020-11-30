package com.dtstack.engine.master.jobdealer;

import com.dtstack.engine.master.AbstractTest;
import com.dtstack.engine.master.jobdealer.resource.CommonResource;
import com.dtstack.engine.master.jobdealer.resource.ComputeResourceType;
import com.dtstack.engine.master.utils.CommonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author tengzhen
 * @Description:
 * @Date: Created in 8:36 下午 2020/11/12
 */
public class TestCommonResource  extends AbstractTest {


    @Autowired
    private CommonResource commonResource;


    @Test
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    @Rollback
    public void testNewInstance() throws Exception {

        ComputeResourceType resourceType = commonResource.newInstance(CommonUtils.getJobClient());
        Assert.assertNotNull(resourceType);
    }

}
