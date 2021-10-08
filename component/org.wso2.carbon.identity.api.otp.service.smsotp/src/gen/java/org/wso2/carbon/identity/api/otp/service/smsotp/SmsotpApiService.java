/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.com).
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.otp.service.smsotp;

import org.wso2.carbon.identity.api.otp.service.smsotp.*;
import org.wso2.carbon.identity.api.otp.service.smsotp.dto.*;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import java.io.InputStream;
import java.util.List;
import org.wso2.carbon.identity.api.otp.service.smsotp.dto.Error;
import org.wso2.carbon.identity.api.otp.service.smsotp.dto.OTPGenerateResponse;
import org.wso2.carbon.identity.api.otp.service.smsotp.dto.OTPGenerationRequest;
import org.wso2.carbon.identity.api.otp.service.smsotp.dto.OTPValidationRequest;
import org.wso2.carbon.identity.api.otp.service.smsotp.dto.OTPValidationResponse;
import javax.ws.rs.core.Response;


public interface SmsotpApiService {

      public Response smsotpGeneratePost(OTPGenerationRequest otPGenerationRequest);

      public Response smsotpValidatePost(OTPValidationRequest otPValidationRequest);
}
