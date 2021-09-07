/*
 * Copyright 2021 Apollo Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.ctrip.framework.apollo.portal.listener;

import com.google.common.base.Preconditions;

import com.ctrip.framework.apollo.common.entity.App;

import org.springframework.context.ApplicationEvent;

/**
 * App 创建事件，继承自 Spring 提供的 ApplicationEvent
 */
public class AppCreationEvent extends ApplicationEvent {

  /**
   * 构造方法，传入 App 对象
   * @param source App 对象
   */
  public AppCreationEvent(Object source) {
    super(source);
  }

  /**
   * 获得事件对应的 App 对象
   * @return
   */
  public App getApp() {
    Preconditions.checkState(source != null);
    return (App) this.source;
  }
}
