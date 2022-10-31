package com.flyan.swiftmcweb.demo.biz.sys.service.user;


import com.flyan.swiftmcweb.core.pojo.Message;
import com.flyan.swiftmcweb.core.pojo.ResponseMessage;
import com.flyan.swiftmcweb.core.web.service.BaseMessageHandleService;
import com.flyan.swiftmcweb.demo.biz.common.poj.PageResult;
import com.flyan.swiftmcweb.demo.biz.sys.api.user.dto.UserInfoDTO;
import com.flyan.swiftmcweb.demo.biz.sys.api.user.vo.UserDetailVO;
import com.flyan.swiftmcweb.demo.biz.sys.api.user.vo.UserPageQueryVO;

/**
 * @author flyan
 * @version 1.0
 * @date 10/25/22
 */
public interface UserService extends BaseMessageHandleService {

    /**
     * 判断用户是否存在
     *
     * @param message   消息
     * @return
     */
    ResponseMessage<Boolean> exists(Message<Long> message);

    /**
     * 获取用户信息
     *
     * @param message
     * @return
     */
    ResponseMessage<UserInfoDTO> getUserInfo(Message<Long> message);

    /**
     * 新增/更新用户
     *
     * @param message
     * @return
     */
    ResponseMessage<Long> saveOrUpdateUser(Message<UserDetailVO> message);

    /**
     * 删除用户
     *
     * @param message
     * @return
     */
    ResponseMessage<Long> delUser(Message<Long> message);

    /**
     * 分页查询用户
     *
     * @param message
     * @return
     */
    ResponseMessage<PageResult<UserInfoDTO>> page(Message<UserPageQueryVO> message);

}
